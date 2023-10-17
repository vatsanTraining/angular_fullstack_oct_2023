import { TestBed } from '@angular/core/testing';
import { CanActivateFn } from '@angular/router';

import { universalGuardGuard } from './universal-guard.guard';

describe('universalGuardGuard', () => {
  const executeGuard: CanActivateFn = (...guardParameters) => 
      TestBed.runInInjectionContext(() => universalGuardGuard(...guardParameters));

  beforeEach(() => {
    TestBed.configureTestingModule({});
  });

  it('should be created', () => {
    expect(executeGuard).toBeTruthy();
  });
});
